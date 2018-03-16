package cn.qianying.graduaction.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * redis缓存工具
 */
@Component("redisUtil")
public class RedisUtil {
    private static Logger logger = LoggerFactory.getLogger(RedisUtil.class);

    @Resource(name = "redisTemplate")
    private RedisTemplate<Serializable, Object> redisTemplate;

    /**
     * 打开redis服务
     */
    private RedisUtil() {
        openRedisService();
    }

    /**
     * 写入或更新缓存
     *
     * @param key
     * @param value
     * @return
     */
    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate
                    .opsForValue();
            operations.set(key, value);
            result = true;
        } catch (Exception e) {
            logger.error("write redis is faill");
            e.printStackTrace();

        }
        return result;
    }


    /**
     * 写入缓存
     * 设置失效时间
     *
     * @param key
     * @param value
     * @return
     */
    public boolean set(final String key, Object value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate
                    .opsForValue();
            operations.set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 读取缓存
     *
     * @param key
     * @return
     */
    public Object get(final String key) {
        Object result = null;
        ValueOperations<Serializable, Object> operations = redisTemplate
                .opsForValue();
        result = operations.get(key);
        return result;
    }

    /**
     * 删除对应的value
     *
     * @param key
     */
    public void remove(final String key) {
        if (exists(key)) {
            redisTemplate.delete(key);
        }
    }

    /**
     * 批量删除对应的value
     *
     * @param keys
     */
    public void remove(final String... keys) {
        for (String key : keys) {
            remove(key);
        }
    }

    /**
     * 批量删除key
     *
     * @param pattern 正则表达式
     */
    public void removePattern(final String pattern) {
        Set<Serializable> keys = redisTemplate.keys(pattern);
        if (keys.size() > 0)
            redisTemplate.delete(keys);
    }

    /**
     * 判断缓存中是否有对应的value
     *
     * @param key
     * @return
     */
    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    public void setRedisTemplate(
            RedisTemplate<Serializable, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 启动redis服务
     */
    private static void openRedisService() {
        String command = "d:\\redis\\redis-server d:\\redis\\redis.windows.conf";
//        String command = getOpenRedisServiceCommand();
        logger.info("the command of opening redis service is: " + command);
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec(command);
            /*Process process = runtime.exec(command);
            BufferedReader bufferedReader = new BufferedReader
                    (new InputStreamReader(process.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line + "\n");
                logger.info(line);
            }*/
        } catch (IOException e) {
            logger.error("fail to open d dictionary to open redis service", e);
            return;
        }
    }

    private static String openRedisServiceCommand;

    public static String getOpenRedisServiceCommand() {
        return openRedisServiceCommand;
    }

//    @Value("#{redisConfig['redis.serviceCommand']}")
    public static void setOpenRedisServiceCommand(String openRedisServiceCommand) {
        RedisUtil.openRedisServiceCommand = openRedisServiceCommand;
    }

    public static void main(String[] args) {
        openRedisService();

        Runtime runtime = Runtime.getRuntime();

        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");

        System.out.println("连接成功");
        //查看服务是否运行
//        System.out.println("服务正在运行: "+jedis.ping());


        /*String command="ipconfig -all";
        String s = "IPv4";
        String line = null;
        StringBuilder sb = new StringBuilder();
        try {
            Process process = runtime.exec(command);
            BufferedReader bufferedReader = new BufferedReader
                    (new InputStreamReader(process.getInputStream()));

            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line + "\n");
                if (line.contains(s)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
