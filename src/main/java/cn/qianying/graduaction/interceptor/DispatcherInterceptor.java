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
    private final String GO_KEYWORD = "census";

    private final String INDEX_PAGE = "/index";

    private DispatcherInterceptor() {
//        System.out.println("DispatcherInterceptor used!!!!!!!!!!========================================");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception ex) throws Exception {

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView modelAndView) throws Exception {
//        System.out.println("postHandle used!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*String basePath = request.getScheme() + "//:" + request.getServerName() + ":" + request.getServerPort();
        String requestUri = request.getRequestURI();
        System.out.println("request uri: ===================" + requestUri);
        String[] uris = requestUri.split("/");
        requestUri = requestUri.replace("/" + uris[2], "");
        System.out.println("count: " + uris.length + " type: " + uris[1]);
        if (uris.length > 0 && uris[1] != null) {
            switch (uris[1]) {
                case "go":
                    response.sendRedirect("/go/" + GO_KEYWORD + requestUri.substring(requestUri.indexOf("/go") + 3, requestUri.length()));
                    System.out.println("used!!!!!!!!!!!!!!" + basePath + "/go/" + GO_KEYWORD + requestUri.substring(requestUri.indexOf("/go") + 3, requestUri.length()));
                    return false;
                case "video":
                    request.getRequestDispatcher(basePath + "/video/" + GO_KEYWORD + requestUri.substring(requestUri.indexOf("/video") + 6, requestUri.length())).forward(request, response);
                    return false;
                default:
                    response.sendRedirect(basePath + INDEX_PAGE);
                    return false;
            }
        } else {
            response.sendRedirect(basePath + INDEX_PAGE);
            return false;
        }*/
        return true;
    }

}
