package guru.sfg.brewery.events;

import guru.sfg.brewery.domain.Beer;
import org.springframework.context.ApplicationEvent;
/**
 * Created by Luca Moro on 24/02/2021.
 */
public class NewInventoryEvent extends ApplicationEvent {

    public NewInventoryEvent(Beer source) {
        super(source);
    }

    public Beer getBeer(){
        return (Beer) this.source;
    }
}
