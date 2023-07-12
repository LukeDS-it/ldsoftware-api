package ldsoftware

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple:
  val run = LdsoftwareapiServer.run[IO]
