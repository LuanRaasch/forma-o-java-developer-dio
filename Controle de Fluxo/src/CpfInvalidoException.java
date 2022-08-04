public class CpfInvalidoException extends Exception{

    public static String validarCpf(String cpf) throws CpfInvalidoException {
        if(cpf.length() != 11) throw new CpfInvalidoException();
        return cpf;
    }
}
