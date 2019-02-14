package com.gu.tsilverGatewayWorkshop
import io.circe.Encoder
import io.circe.syntax._
import io.circe.generic.extras.semiauto._


case class ApiResponse(statusCode: Int, headers: Map[String, String], body: String)

object ApiResponse {

  implicit val APIResponseEncoder : Encoder[ApiResponse] = deriveEncoder

}
