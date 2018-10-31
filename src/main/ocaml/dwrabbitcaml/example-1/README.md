#Example

##Compilation

[fl218080@is233628 dwrabbitcaml]$ ocamlfind ocamlopt -thread -package amqp-client-async amqp_example.ml -linkpkg -o amqp_example
[fl218080@is233628 dwrabbitcaml]$ ls
amqp_example  amqp_example.cmi  amqp_example.cmx  amqp_example.ml  amqp_example.o  README.md

##Test connection

[fl218080@is233628 dwrabbitcaml]$ ./amqp_example 
2018-10-11 11:04:16.874233+02:00 Info product: RabbitMQ -- [library: amqp_client]
2018-10-11 11:04:16.874235+02:00 Info version: 3.6.2 -- [library: amqp_client]
2018-10-11 11:04:16.874242+02:00 Info Amqp: 0.9 -- [library: amqp_client]
2018-10-11 11:04:16.887202+02:00 Info Close Received ok -- [library: amqp_client]
[fl218080@is233628 dwrabbitcaml]$ 

##Test connection after shutdown of rabbitmq docker

[fl218080@is233628 dwrabbitcaml]$ ./amqp_example 
(((pid 6095) (thread_id 0)) "2018-10-11 09:06:00.343256107Z"
 "unhandled exception in Async scheduler"
 ("unhandled exception"
  ((monitor.ml.Error
    (Unix.Unix_error "Connection refused" connect 127.0.0.1:5672)
    ("Raised by primitive operation at file \"src/unix_syscalls.ml\", line 937, characters 17-76"
     "Called from file \"src/deferred1.ml\", line 20, characters 40-45"
     "Called from file \"src/job_queue.ml\", line 159, characters 6-47"
     "Caught by monitor Tcp.close_sock_on_error"))
   ((pid 6095) (thread_id 0)))))
[fl218080@is233628 dwrabbitcaml]$ 

