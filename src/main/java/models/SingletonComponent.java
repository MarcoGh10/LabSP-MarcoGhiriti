package models;

import org.springframework.stereotype.Component;

@Component
public class SingletonComponent {
    public SingletonComponent() {
        System.out.println(
                "models.SingletonComponent::models.SingletonComponent = " + this);

    }

    public void operation() {
        System.out.println(
                "Invoked models.SingletonComponent::operation() on " + this);

    }
}