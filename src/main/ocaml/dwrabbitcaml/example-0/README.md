#Example

##Compilation

ocamlfind ocamlopt -thread -package amqp-client-lwt lwt_example.ml -linkpkg -o lwt_example

##Test connection

[fl218080@is233628 dwrabbitcaml]$ ./lwt_example 

have a look to rabbitmq ui.
you should see the messages.

