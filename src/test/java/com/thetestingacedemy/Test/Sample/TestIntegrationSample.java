package com.thetestingacedemy.Test.Sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {

    //create a booking, create a token
    //verify that Get booking
    //update the booking
    //delete the booking

@Test(groups="qa",priority =1)
    @Owner("raziq")
    @Description("Verify the sample testcase created")
    public void testcreateBooking(){
        Assert.assertTrue(true);
    }

    @Test(groups="qa",priority =2)
    @Owner("raziq")
    @Description("Verify the sample testcase for getting booking id")
    public void testGetBooking(){
        Assert.assertTrue(true);
    }

    @Test(groups="qa",priority =3)
    @Owner("raziq")
    @Description("Verify the sample testcase for Updating details of customer ")
    public void testUpdateBooking(){
        Assert.assertTrue(true);
    }


    @Test(groups="qa",priority =1)
    @Owner("raziq")
    @Description("Verify the sample testcase deleting the customer details")
    public void testDeleteBooking(){
        Assert.assertTrue(true);
    }
}
