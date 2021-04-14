package model.out

import java.sql.Timestamp

case class Cat(
              id: String = null,
              user: String = null,
              fact: Option[String] = None,
              creationDate: Option[Timestamp] = None,
              updateDate: Option[Timestamp] = None
              )
