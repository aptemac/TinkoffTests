package Tinkoff;


import org.junit.Assert;
import org.junit.Test;

public class MyTest{
    @Test
    public void Exercise6Tests(){

        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{2,1,4,6}),new int[]{-1,-1});
        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{1,2}),new int[]{-1,-1});
        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{2,1}),new int[]{1,2});

        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{1,2,3,4,5,6,7,8,9}),new int[]{1,3});
        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{2,1,5,4}),new int[]{1,2});
        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{1,2,3,4}),new int[]{1,3});
        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{4,2,3,1,5,6}),new int[]{1,4});
        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{2,2,1,2,1,1}),new int[]{1,6});
        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{1,2,4,3}),new int[]{3,4});

        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{2,1,4,5}),new int[]{-1,-1});
        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{2,2,1,1}),new int[]{1,4});
        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{2,2,1,1,1,2,2,1}),new int[]{-1,-1});

        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{2,1,3}),new int[]{1,2});
        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{1,2,2}),new int[]{-1,-1});
        Assert.assertArrayEquals(Exercise6.checkStudents(new int[]{1,2,1}),new int[]{1,3});


    }

}
