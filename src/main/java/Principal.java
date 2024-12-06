import exercicios.*;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {

        // Testando CidadeRecord (imutável)
        CidadeRecord cidadeRecord = new CidadeRecord("São Paulo");
        System.out.println("CidadeRecord inicial: " + cidadeRecord);
        // Não é possível alterar o valor de cidadeRecord.nome
        //cidadeRecord.nome = "Rio de Janeiro"; // Erro de compilação

        // Testando Cidade (mutável)
        Cidade cidade = new Cidade("São Paulo");
        System.out.println("Cidade inicial: " + cidade);
        cidade.setNome("Rio de Janeiro");
        System.out.println("Cidade alterada: " + cidade);

        // Testando PessoaRecordShallow (imutável superficialmente)
        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("João", cidade);
        System.out.println("PessoaRecordShallow inicial: " + pessoaShallow);
        pessoaShallow.cidade().setNome("Belo Horizonte");
        System.out.println("PessoaRecordShallow após alterar cidade: " + pessoaShallow);

        // Testando PessoaRecord (imutável profundamente)
        CidadeRecord cidadeRecord2 = new CidadeRecord("São Paulo");
        PessoaRecord pessoaDeep = new PessoaRecord("Maria", cidadeRecord2);
        System.out.println("PessoaRecord inicial: " + pessoaDeep);
        // Não é possível alterar cidadeRecord ou pessoaDeep
        // pessoaDeep.cidade().nome = "Rio de Janeiro"; // Erro de compilação
        // pessoaDeep.nome = "Ana"; // Erro de compilação

        // Comparando resultados
        System.out.println("\n--- Resumo dos Testes ---");
        System.out.println("CidadeRecord é imutável: Não permite alterações.");
        System.out.println("Cidade é mutável: Permite alterações via setters.");
        System.out.println("PessoaRecordShallow é superficialmente imutável: A cidade interna pode ser alterada.");
        System.out.println("PessoaRecord é profundamente imutável: Nenhum campo pode ser alterado.");
    }
}
