package com.olivercastilho.universidadesdobrasil
import com.universidadesdobrasil.data.models.State
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import com.universidadesdobrasil.data.repositories.StateRepository

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class StateRepositoryTest {
    private var states: List<State>? = null

    @Before
    fun setUp(){
        states = StateRepository.getStates()
    }

    @Test
    fun stateNumber_isTwentySeven() {
        assertEquals(27, states!!.size)
    }

    @Test
    fun stateNames_areCorrects() {
        assertEquals("Acre", states!![0].name)
        assertEquals("Alagoas", states!![1].name)
        assertEquals("Amapá", states!![2].name)
        assertEquals("Amazonas", states!![3].name)
        assertEquals("Bahia", states!![4].name)
        assertEquals("Ceará", states!![5].name)
        assertEquals("Distrito Federal", states!![6].name)
        assertEquals("Goiás", states!![7].name)
        assertEquals("Espírito Santo", states!![8].name)
        assertEquals("Maranhão", states!![9].name)
        assertEquals("Mato Grosso", states!![10].name)
        assertEquals("Mato Grosso do Sul", states!![11].name)
        assertEquals("Minas Gerais", states!![12].name)
        assertEquals("Pará", states!![13].name)
        assertEquals("Paraná", states!![14].name)
        assertEquals("Paraíba", states!![15].name)
        assertEquals("Pernambuco", states!![16].name)
        assertEquals("Piauí", states!![17].name)
        assertEquals("Rio de Janeiro", states!![18].name)
        assertEquals("Rio Grande do Norte", states!![19].name)
        assertEquals("Rio Grande do Sul", states!![20].name)
        assertEquals("Rondônia", states!![21].name)
        assertEquals("Roraima", states!![22].name)
        assertEquals("Santa Catarina", states!![23].name)
        assertEquals("São Paulo", states!![24].name)
        assertEquals("Sergipe", states!![25].name)
        assertEquals("Tocantins", states!![26].name)
    }

    @After
    fun tearDown(){
        states = null
    }
}
