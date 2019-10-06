package com.irsyadashari.kade_submission_1

import android.accounts.AuthenticatorDescription
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item (val name: String?, val description: String?,val image: Int) : Parcelable