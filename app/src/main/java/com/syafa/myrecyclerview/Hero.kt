package com.syafa.myrecyclerview

import android.accounts.AuthenticatorDescription
import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Hero (
    var name: String,
    var description: String,
    var  photo : String
) :Parcelable
