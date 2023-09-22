package com.yilianyun.printer.http;

import com.yilianyun.printer.constant.ApiUrlConstant;
import com.yilianyun.printer.model.request.YiLianAuthTokenModel;
import com.yilianyun.printer.model.request.YiLianAuthorizeModel;
import com.yilianyun.printer.model.request.YiLianQrCodeAuthTokenModel;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/09/22
 * @description 易联云HTTP请求
 * @since 1.0.0
 */
public interface YiLianHttp {
    /**
     * 易联云获取商户CODE
     *
     * @param params {@link YiLianAuthorizeModel} 易联云获取授权CODE模型
     * @return {@link Call}<{@link ResponseBody}>
     */
    @GET(ApiUrlConstant.OAUTH_AUTHORIZE)
    Call<ResponseBody> getMerchantCode(@QueryMap YiLianAuthorizeModel params);

    /**
     * 易联云获取授权TOKEN（Oauth、自有）
     * <p>
     * 1. Oauth授权类型：<strong>authorization_code</strong>，Token有时间限制 <br>
     * 2. 自有授权类型：<strong>client_credentials</strong>，Token无时间限制 <br>
     * </p>
     *
     * @param params {@link YiLianAuthTokenModel} 易联云获取授权TOKEN模型
     * @return {@link Call}<{@link ResponseBody}>
     */
    @POST(ApiUrlConstant.OAUTH_TOKEN)
    Call<ResponseBody> getAccessToken(@Body YiLianAuthTokenModel params);

    /**
     * 易联云获取授权TOKEN（开放）
     * <p>
     * 开放授权类型：<strong>open</strong>，Token有时间限制 <br>
     * </p>
     *
     * @param params {@link YiLianQrCodeAuthTokenModel} 易联云获取授权TOKEN模型
     * @return {@link Call}<{@link ResponseBody}>
     */
    @POST(ApiUrlConstant.OAUTH_TOKEN_OPEN)
    Call<ResponseBody> getAccessTokenOpen(@Body YiLianQrCodeAuthTokenModel params);

    /**
     * 易联云刷新授权TOKEN（Oauth、开放）
     *
     * @param params {@link YiLianAuthTokenModel} 易联云获取授权TOKEN模型
     * @return {@link Call}<{@link ResponseBody}>
     */
    @POST(ApiUrlConstant.OAUTH_REFRESH_TOKEN)
    Call<ResponseBody> refreshAccessToken(@Body YiLianAuthTokenModel params);
}
