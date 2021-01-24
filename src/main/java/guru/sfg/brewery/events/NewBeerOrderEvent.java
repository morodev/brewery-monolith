package guru.sfg.brewery.events;

import guru.sfg.brewery.domain.BeerOrder;
import org.springframework.context.ApplicationEvent;
/**
 * Created by Luca Moro on 24/02/2021.
 */
public class NewBeerOrderEvent extends ApplicationEvent {

    public NewBeerOrderEvent(BeerOrder source) {
        super(source);
    }

    public BeerOrder getBeerOrder(){
        return (BeerOrder) this.source;
    }
}
