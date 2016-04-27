package com.sandwich.koan;

import com.sandwich.koan.cmdline.CommandLineArgumentRunner;
import com.sandwich.koan.path.CommandLineTestCase;
import org.junit.Test;

import java.util.Arrays;

public class AnonymousInnerClassTest extends CommandLineTestCase {

    @Test
    public void testAnonymousInnerClassIsCoolToUseAsKoan() throws Exception {
        final String definitelyAUniqueString = "meh1294120240912049";
        stubAllKoans(Arrays.asList(new Object() {
            @Koan
            public void printMsg() {
                System.out.println(definitelyAUniqueString);
            }
        }));
        new CommandLineArgumentRunner().run();
        assertSystemOutContains(definitelyAUniqueString);
    }

}
