package org.powerbot.game.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Manifest {
    String name();

    String description() default "";

    double version() default 1.0;

    String[] authors();

    String website() default "";

    int topic() default 0;

    boolean vip() default false;

    boolean hidden() default false;

    boolean singleinstance() default false;
}