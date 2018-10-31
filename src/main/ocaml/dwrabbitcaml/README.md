
#Reference

https://github.com/andersfugmann/amqp-client/tree/master/examples

#Installation

##installation amqp-client-lwt

[fl218080@is233628 dwrabbitcaml]$ opam install amqp-client-lwt
The following actions will be performed:
  ∗  install lwt_log         1.0.0            [required by amqp-client-lwt]
  ∗  install xml-light       2.4              [required by amqp-client-lwt]
  ∗  install ocplib-endian   1.0              [required by amqp-client-lwt]
  ∗  install amqp-client     2.0.3            [required by amqp-client-lwt]
  ∗  install amqp-client-lwt 2.0.3
===== ∗  5 =====
Do you want to continue ? [Y/n] y

=-=- Gathering sources =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
[default] https://opam.ocaml.org/1.2.2/archives/amqp-client-lwt.2.0.3+opam.tar.gz downloaded
[default] https://opam.ocaml.org/1.2.2/archives/amqp-client.2.0.3+opam.tar.gz downloaded
[default] https://opam.ocaml.org/1.2.2/archives/lwt_log.1.0.0+opam.tar.gz downloaded
[default] https://opam.ocaml.org/1.2.2/archives/xml-light.2.4+opam.tar.gz downloaded
[default] https://opam.ocaml.org/1.2.2/archives/ocplib-endian.1.0+opam.tar.gz downloaded

=-=- Processing actions -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
∗  installed lwt_log.1.0.0
∗  installed xml-light.2.4
∗  installed ocplib-endian.1.0
∗  installed amqp-client.2.0.3
∗  installed amqp-client-lwt.2.0.3
Done.
[fl218080@is233628 dwrabbitcaml]$ 

##installation amqp-client-async

[fl218080@is233628 dwrabbitcaml]$ opam install amqp-client-async
The following actions will be performed:
  ∗  install async_kernel            v0.11.1  [required by async]
  ∗  install protocol_version_header v0.11.0  [required by async_rpc_kernel]
  ∗  install async_unix              v0.11.0  [required by async]
  ∗  install async_rpc_kernel        v0.11.0  [required by async_extra]
  ∗  install async_extra             v0.11.1  [required by async]
  ∗  install async                   v0.11.0  [required by amqp-client-async]
  ∗  install amqp-client-async       2.0.3  
===== ∗  7 =====
Do you want to continue ? [Y/n] y

=-=- Gathering sources =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
[default] https://opam.ocaml.org/1.2.2/archives/async.v0.11.0+opam.tar.gz downloaded
[default] https://opam.ocaml.org/1.2.2/archives/async_extra.v0.11.1+opam.tar.gz downloaded
[default] https://opam.ocaml.org/1.2.2/archives/amqp-client-async.2.0.3+opam.tar.gz downloaded
[default] https://opam.ocaml.org/1.2.2/archives/async_kernel.v0.11.1+opam.tar.gz downloaded
[default] https://opam.ocaml.org/1.2.2/archives/async_rpc_kernel.v0.11.0+opam.tar.gz downloaded
[default] https://opam.ocaml.org/1.2.2/archives/async_unix.v0.11.0+opam.tar.gz downloaded
[default] https://opam.ocaml.org/1.2.2/archives/protocol_version_header.v0.11.0+opam.tar.gz downloaded

=-=- Processing actions -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
∗  installed protocol_version_header.v0.11.0
∗  installed async_kernel.v0.11.1
∗  installed async_rpc_kernel.v0.11.0
∗  installed async_unix.v0.11.0
∗  installed async_extra.v0.11.1
∗  installed async.v0.11.0
∗  installed amqp-client-async.2.0.3
Done.
[fl218080@is233628 dwrabbitcaml]$ 


