package com.christianbahl.paperparcel

import android.os.Parcel
import com.christianbahl.aninterface.FuckingParcelable
import paperparcel.PaperParcel

/**
 * Created by cbahl on 09.01.17.
 */
@PaperParcel data class Test2(val fuckingTest: String) : FuckingParcelable {

  companion object {
    @JvmField val CREATOR = PaperParcelTest2.CREATOR
  }

  override fun describeContents() = 0

  override fun writeToParcel(dest: Parcel, flags: Int) {
    PaperParcelTest2.writeToParcel(this, dest, flags)
  }

}