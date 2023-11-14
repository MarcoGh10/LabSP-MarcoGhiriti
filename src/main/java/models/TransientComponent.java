package models;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TransientComponent {
    public TransientComponent() {
        System.out.println("models.TransientComponent::models.TransientComponent = "

                + this);
    }

    public void operation() {
        System.out.println("Invoked models.TransientComponent::operation() on " + this);

    }
}