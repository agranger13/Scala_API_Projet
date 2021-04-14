package model.in

import java.sql.Timestamp

case class CatIn(
                id:String,
                user: String,
                text: Option[String],
                source: Option[String],
                updatedAt: Option[Timestamp],
                createdAt: Option[Timestamp]
                )
