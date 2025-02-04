package br.senai.sp.jandira.imc.model

import java.time.LocalDate
import java.time.LocalTime

class Consulta {
    private var paciente: Paciente? = null
    private var medico: Medico? = null
    private var dataConsulta: LocalDate? = null
    private var horaConsulta: LocalTime? = null
    private var valorConsulta: Double = 0.0

    fun agendarConsulta() {

    }
}