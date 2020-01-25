package com.olivercastilho.universidadesdobrasil.data.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Step(val title: String, val content: String): Parcelable
