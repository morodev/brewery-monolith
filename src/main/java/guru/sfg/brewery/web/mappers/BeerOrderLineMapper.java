package guru.sfg.brewery.web.mappers;

import guru.sfg.brewery.domain.BeerOrderLine;
import guru.sfg.brewery.web.model.BeerOrderLineDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
/**
 * Created by Luca Moro on 24/02/2021.
 */
@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerOrderLineMapperDecorator.class)
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
