package com.adithyavisnu.todolist;

import com.adithyavisnu.todolist.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.adithyavisnu.todolist.data.Foo;
import com.adithyavisnu.todolist.data.Bar;

public class FooBarTests {
    @Test
    void FooBarTest () {
        var foo = new Foo();
        var bar = new Bar();

        var FooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, FooBar.foo);

    }
}
