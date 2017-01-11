package com.christianbahl.model

import android.os.Parcel
import android.os.Parcelable
import com.christianbahl.aninterface.FuckingParcelable
import paperparcel.PaperParcel

/**
 * Created by cbahl on 09.01.17.
 */
@PaperParcel data class Test3(val test: String) : FuckingParcelable {

  companion object {
    @JvmField val CREATOR = PaperParcelTest3.CREATOR
  }

  override fun describeContents() = 0

  override fun writeToParcel(dest: Parcel, flags: Int) {
    PaperParcelTest3.writeToParcel(this, dest, flags)
  }

}