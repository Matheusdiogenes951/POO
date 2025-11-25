📘 Projeto: Cálculo de Média com Exceções Personalizadas

Este projeto em Java lê três notas, valida se estão entre 0 e 10, calcula a média e utiliza uma exceção personalizada caso alguma nota seja inválida.

📁 Estrutura do Projeto
src/
 └── Mediaa/
      ├── CalculadoraMedia.java
      ├── Media.java        ← contém o método main
      └── NotaInvalidaException.java

▶️ Como executar o projeto no IntelliJ IDEA
1. Abra o projeto no IntelliJ

Vá em File → Open

Selecione a pasta do projeto.

2. Compile automaticamente (opcional)

O IntelliJ normalmente compila automaticamente, mas você pode ativar em:
File → Settings → Build, Execution, Deployment → Compiler → Build project automatically

3. Abra o arquivo Media.java

Caminho:

src → Mediaa → Media.java

4. Execute o programa

No topo do método main, clique no botão ▶ (Run) ao lado de:

public static void main(String[] args)


Ou use o atalho:

Shift + F10

📝 Como usar

Quando o programa iniciar, digite as três notas.

Caso alguma nota seja menor que 0 ou maior que 10, você verá uma mensagem de erro exibida pela exceção personalizada.

Se todas forem válidas, o programa mostrará a média das notas.

🧪 Exemplo

Entrada:

Digite a primeira nota: 8
Digite a segunda nota: 10
Digite a terceira nota: -2


Saída:

Erro: Nota inválida: -2. A nota deve estar entre 0 e 10.
