/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.taxcounting.Penghitungan;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bagas
 */
public class PenghitunganTest {

    public PenghitunganTest() {
    }

    private Penghitungan p = new Penghitungan();
    
    @BeforeClass
    public static void awalan() {
        System.out.println("Pengetesan Dimulai");
    }
    @Test
    public void test1(){
        assertNotEquals(null, p);
        System.out.println(p);
    }
    @Test
    public void test2(){
        int bayar;
        
        bayar = p.ngitung(10, 10000);
        System.out.println(bayar);
        assertEquals(110000, bayar);
    }
    @Test
    public void test3(){
        int bayar;
        
        bayar = p.ngitung(0, 10000);
        System.out.println(bayar);
        assertEquals(0, bayar);
    }
    @Test
    public void test4(){ 
        int bayar;
        
        bayar = p.ngitung(10, 0);
        System.out.println(bayar);
        assertEquals(0, bayar);
    }     
    @AfterClass
    public static void akhiran() {
        System.out.println("Pengetesan Selesai");
    }

        // TODO add test methods here.
        // The methods must be annotated with annotation @Test. For example:
        //
        // @Test
        // public void hello() {}
    }
