package com.exemplo.demo.domain;

import br.com.fluentvalidator.AbstractValidator;
import org.springframework.stereotype.Component;

import static br.com.fluentvalidator.predicate.ObjectPredicate.nullValue;
import static java.util.function.Predicate.not;

@Component
public class ChilValidator extends AbstractValidator<Child> {


    @Override
    public void rules() {
        //Definir o contexto da regra
        setPropertyOnContext("child");

        ruleFor(Child::getAge)
            .must(not(nullValue()))
                .withMessage("Child age must be not null")
                .withFieldName("age");

    }
}
