package cn.qianying.graduaction.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 页面分发拦截器
 */
public class DispatcherInterceptor implements HandlerInterceptor {
    /**
     * 跳转其他页面的关键字
     */
    private String GO_KEYWORD = "census";

    private String INDEX_PAGE = "/video/census/index";

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception ex) throws Exception {
        System.out.println("afterCompletion used!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle used!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestUri = request.getRequestURI();
        System.out.println("request uri: ===================" + requestUri);
        /*if (null == webUser) {
            String basePath = request.getScheme() + "//:" + request.getServerName() + ":" + request.getServerPort();
            response.sendRedirect(basePath + "/login");
            return false;
        }*/
        return true;
    }

}
