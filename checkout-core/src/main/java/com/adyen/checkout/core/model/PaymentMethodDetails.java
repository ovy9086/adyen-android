package com.adyen.checkout.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import com.adyen.checkout.base.internal.JsonSerializable;

/**
 * Holds detail information for payments.
 * <p>
 * Copyright (c) 2017 Adyen B.V.
 * <p>
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 * <p>
 * Created by timon on 07/08/2017.
 */
public abstract class PaymentMethodDetails implements Parcelable, JsonSerializable {
    protected PaymentMethodDetails() {
    }

    protected PaymentMethodDetails(@NonNull Parcel in) {
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
