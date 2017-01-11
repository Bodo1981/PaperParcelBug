package com.christianbahl.aninterface

import android.os.Parcel
import paperparcel.PaperParcel

/**
 * Created by cbahl on 11.01.17.
 */
@PaperParcel data class Test0(val test: String) : FuckingParcelable {

    companion object {
        @JvmField val CREATOR = PaperParcelTest0.CREATOR
    }

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) {
        PaperParcelTest0.writeToParcel(this, dest, flags)
    }
}