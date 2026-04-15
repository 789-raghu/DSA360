{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  buildInputs = [
    pkgs.gcc13
    pkgs.gnumake
    pkgs.jdk
    pkgs.python3
  ];
}