package io.github.tuuzed.microhttpd.handler;

import java.io.IOException;

import io.github.tuuzed.microhttpd.request.Method;
import io.github.tuuzed.microhttpd.request.Request;
import io.github.tuuzed.microhttpd.response.Response;
import io.github.tuuzed.microhttpd.response.Status;
import io.github.tuuzed.microhttpd.util.Logger;

/**
 * Http请求处理
 */
public class HttpHandler implements Handler {
    private final static Logger sLogger = Logger.getLogger(HttpHandler.class);

    @Override
    public void serve(Request request, Response response) throws IOException {
        sLogger.d("Receive request..." + request.toString());
        if (Method.GET.equals(request.getMethod())) {
            doGet(request, response);
        } else if (Method.POST.equals(request.getMethod())) {
            doPost(request, response);
        } else if (Method.PUT.equals(request.getMethod())) {
            doPut(request, response);
        } else if (Method.DELETE.equals(request.getMethod())) {
            doDelete(request, response);
        } else if (Method.PATCH.equals(request.getMethod())) {
            doPatch(request, response);
        } else if (Method.HEAD.equals(request.getMethod())) {
            doHead(request, response);
        } else if (Method.CONNECT.equals(request.getMethod())) {
            doConnect(request, response);
        } else if (Method.OPTIONS.equals(request.getMethod())) {
            doOptions(request, response);
        } else if (Method.TRACE.equals(request.getMethod())) {
            doTrace(request, response);
        } else {
            response405(response);
        }
    }

    /**
     * GET 请求
     *
     * @param request  :请求
     * @param response :响应
     * @throws IOException :遇到异常时抛出
     */
    public void doGet(Request request, Response response) throws IOException {
        response405(response);
    }

    /**
     * POST 请求
     *
     * @param request  :请求
     * @param response :响应
     * @throws IOException :遇到异常时抛出
     */
    public void doPost(Request request, Response response) throws IOException {
        response405(response);
    }

    /**
     * PUT 请求
     *
     * @param request  :请求
     * @param response :响应
     * @throws IOException :遇到异常时抛出
     */
    public void doPut(Request request, Response response) throws IOException {
        response405(response);
    }

    /**
     * DELETE 请求
     *
     * @param request  :请求
     * @param response :响应
     * @throws IOException :遇到异常时抛出
     */
    public void doDelete(Request request, Response response) throws IOException {
        response405(response);
    }

    /**
     * PATCH 请求
     *
     * @param request  :请求
     * @param response :响应
     * @throws IOException :遇到异常时抛出
     */
    public void doPatch(Request request, Response response) throws IOException {
        response405(response);
    }

    /**
     * HEAD 请求
     *
     * @param request  :请求
     * @param response :响应
     * @throws IOException :遇到异常时抛出
     */
    public void doHead(Request request, Response response) throws IOException {
        response405(response);
    }

    /**
     * CONNECT 请求
     *
     * @param request  :请求
     * @param response :响应
     * @throws IOException :遇到异常时抛出
     */
    public void doConnect(Request request, Response response) throws IOException {
        response405(response);
    }

    /**
     * OPTIONS 请求
     *
     * @param request  :请求
     * @param response :响应
     * @throws IOException :遇到异常时抛出
     */
    public void doOptions(Request request, Response response) throws IOException {
        response405(response);
    }

    /**
     * TRACE 请求
     *
     * @param request  :请求
     * @param response :响应
     * @throws IOException :遇到异常时抛出
     */
    public void doTrace(Request request, Response response) throws IOException {
        response405(response);
    }

    // 响应405，方法未允许
    private void response405(Response response) throws IOException {
        response.setStatus(Status.STATUS_405);
        response.write(Status.STATUS_405.toString());
    }
}
