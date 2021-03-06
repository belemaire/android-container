package com.ern.api.impl;

import android.support.annotation.Nullable;

/**
 * Created by d0g00g4 on 10/12/17.
 */

public abstract class ApiImplProvider<T> implements ApiRequestHandlerProvider {

    protected RequestHandlerConfig<T> requestHandlerConfig;

    /**
     * @param requestHandlerConfig: Optional config object that can be passed to an api impl provider.
     */
    public ApiImplProvider(@Nullable RequestHandlerConfig<T> requestHandlerConfig) {
        this.requestHandlerConfig = requestHandlerConfig;
    }

}
