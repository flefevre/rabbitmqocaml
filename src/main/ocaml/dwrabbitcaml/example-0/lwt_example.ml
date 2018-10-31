open Lwt.Infix
open Amqp_client_lwt

let host = "localhost"

let run () =
  Amqp.Connection.connect ~id:"MyConnection" host >>= fun connection ->
  Amqp.Connection.open_channel ~id:"MyChannel22" Amqp.Channel.no_confirm connection >>= fun channel ->
  Amqp.Queue.declare channel "MyQueue" >>= fun queue ->
  Amqp.Queue.publish channel queue (Amqp.Message.make "My Message Payload") >>= function `Ok ->
  Amqp.Channel.close channel >>= fun () ->
  Amqp.Connection.close connection >>= fun () ->
  Lwt.return ()

let _ =
  Lwt_main.run (run ())