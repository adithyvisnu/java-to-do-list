package com.adithyavisnu.todolist.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@Data
@AllArgsConstructor
public class FooBar {
    private Foo foo;
    private Bar bar;
}
