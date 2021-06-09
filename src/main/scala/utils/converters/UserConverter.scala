package utils.converters

import model.in.UserIn
import model.out.User


object UserConverter extends Converter[UserIn, User] {

  override def convert(input: UserIn): User = {
    User(
      id = input.user_id,
      username = input.username,
      gender = input.gender,
      birthday = input.birthday,
      location = input.location
    )
  }
}
