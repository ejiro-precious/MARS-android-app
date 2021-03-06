package com.uta.mars.api

case class Account(netId: String, role: String, username: String, createTime: Long)

object Account {
  import play.api.libs.json._

  implicit val accountFmt = Json.reads[Account]
}
