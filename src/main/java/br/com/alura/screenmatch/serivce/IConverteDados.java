package br.com.alura.screenmatch.serivce;

public interface IConverteDados {
    <T> T obterDados(String Json, Class<T> classe);
}
