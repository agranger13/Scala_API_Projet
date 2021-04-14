package utils.converters

import model.in.CatIn
import model.out.Cat

object CatConverter extends Converter[CatIn, Cat]{
  override def convert(input: CatIn): Cat =
    Cat(
      id = input.id,
      user = input.user,
      fact = input.text,
      creationDate = input.createdAt,
      updateDate = input.updatedAt
    )
}
