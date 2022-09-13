package com.luciano.servicosagenda.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Client(
    var name: String, var cpf: Int, var sexo: String
) : Parcelable {

}