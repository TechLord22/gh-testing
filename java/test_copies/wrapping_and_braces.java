/*
 * This is a sample file.
 */

public class ThisIsASampleClass extends C1 implements I1, I2, I3, I4, I5
 {
    private int f1 = 1;
    private String field2 = "";

    public void foo1(int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public static void longerMethod() throws Exception1, Exception2, Exception3 {
// todo something
        int
                i = 0;
        int[] a = new int[]{1, 2, 0x0052, 0x0053, 0x0054};
        int[] empty = new int[]{};
        int var1 = 1;
        int var2 = 2;
        foo1(0x0051, 0x0052, 0x0053, 0x0054, 0x0055, 0x0056, 0x0057);
        int x = (3 + 4 + 5 + 6) * (7 + 8 + 9 + 10) * (11 + 12 + 13 + 14 + 0xFFFFFFFF);
        String s1, s2, s3;
        s1 = s2 = s3 = "012345678901456";
        assert i + j + k + l + n + m <= 2:"assert description";
        int y = 2 > 3 ? 7 + 8 + 9:11 + 12 + 13;
        super.getFoo().foo().getBar().bar();

        label:
        if (2 < 3) {
            return;
        } else if (2 > 3) return;
        else return;
        for (int i = 0; i < 0xFFFFFF; i += 2)
            System.out.println(i);
        while (x < 50000) x++;
        do x++; while (x < 10000);
        switch (a) {
            case 0:
            case 1:
                doCase0();
                break;
            case 2:
            case 3:
                return;
            default:
                doDefault();
        }
        try (MyResource r1 = getResource(); MyResource r2 = null) {
            doSomething();
        } catch (Exception e) {
            processException(e);
        } finally {
            processFinally();
        }
        do {
            x--;
        } while (x > 10);
        try (MyResource r1 = getResource();
             MyResource r2 = null) {
            doSomething();
        }
        Runnable r = () -> {};
    }

    public static void test()
            throws Exception {
        foo.foo().bar("arg1",
            "arg2");
        new Object() {};
    }

    class TestInnerClass {
    }

    interface TestInnerInterface {
    }
}

enum Breed {
    Dalmatian(), Labrador(), Dachshund()
}

@Annotation1
@Annotation2
@Annotation3(param1 = "value1", param2 = "value2")
@Annotation4
class Foo {
    @Annotation1
    @Annotation3(param1 = "value1", param2 = "value2")
    public static void foo() 
    {
    }

    @Annotation1
    @Annotation3(param1 = "value1", param2 = "value2")
    public static int myFoo;

    public void method(@Annotation1 @Annotation3(param1 = "value1", param2 = "value2") final int param) {
        @Annotation1 @Annotation3(param1 = "value1", param2 = "value2") final int localVariable;
    }
}
