package com.developer.allef.mynotes;

import android.content.Context;
import android.test.suitebuilder.annotation.MediumTest;


import com.developer.allef.mynotes.Model.Notas;
import com.orm.SugarApp;
import com.orm.SugarContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest extends SugarApp {

    @Test
    public void adicionarNotaTest()throws Exception  {

        Notas nota = new Notas("Junit Nota Test", "Teste de notas com Junit , teste Unitario");
        assertEquals(true,nota.save());
    }



}