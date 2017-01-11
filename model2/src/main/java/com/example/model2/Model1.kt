package com.example.model2

import android.os.Parcel
import com.christianbahl.aninterface.FuckingParcelable
import paperparcel.PaperParcel

/**
 * Created by cbahl on 11.01.17.
 */
@PaperParcel data class Model1(val test: String) : FuckingParcelable {

    companion object {
        @JvmField val CREATOR = PaperParcelModel1.CREATOR
    }

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) {
        PaperParcelModel1.writeToParcel(this, dest, flags)
    }
}