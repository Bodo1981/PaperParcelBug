package com.christianbahl.paperparcel

import android.os.Parcel
import android.os.Parcelable
import paperparcel.PaperParcel

/**
 * Created by cbahl on 09.01.17.
 */
@PaperParcel class Test : Parcelable{
  
var test = ""
  
  companion object {
    @JvmField val CREATOR = PaperParcelTest.CREATOR
  }
  
  override fun describeContents() = 0
  
  override fun writeToParcel(dest: Parcel, flags: Int) {
    PaperParcelTest.writeToParcel(this, dest, flags)
  }
  
}