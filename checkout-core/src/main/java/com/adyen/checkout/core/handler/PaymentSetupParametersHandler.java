package com.adyen.checkout.core.handler;

import android.support.annotation.NonNull;

import com.adyen.checkout.core.PaymentSetupParameters;

/**
 * Copyright (c) 2018 Adyen B.V.
 * <p>
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 * <p>
 * Created by timon on 04/06/2018.
 */
public interface PaymentSetupParametersHandler extends ErrorHandler {
    /**
     * Called when a payment session needs to be requested from the Adyen payments platform.
     *
     * @param paymentSetupParameters The parameters that need to be submitted to Adyen in order to create the payment session.
     */
    void onRequestPaymentSession(@NonNull PaymentSetupParameters paymentSetupParameters);
}
