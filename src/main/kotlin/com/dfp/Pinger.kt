package com.dfp

import io.vlingo.actors.Stoppable

interface Pinger: Stoppable {

    fun ping(ponger:Ponger)

}