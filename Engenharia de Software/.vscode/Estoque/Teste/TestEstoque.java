import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class TestEstoque {

    @Test
    public void testAdicionar() {
        Estoque estoque = new Estoque();
        estoque.adicionar();
        assertEquals(1, estoque.estoqueConsoles.size());
    }

    @Test
    public void testVerLista() {
        Estoque estoque = new Estoque();
        Console console1 = new Console("Console1", new Especificacao("Marca1", "Modelo1", 500, "Cor1", 1));
        Console console2 = new Console("Console2", new Especificacao("Marca2", "Modelo2", 1000, "Cor2", 2));
        estoque.estoqueConsoles.add(console1);
        estoque.estoqueConsoles.add(console2);
        assertEquals(2, estoque.estoqueConsoles.size());
    }

    @Test
    public void testRemoverPorId() {
        Estoque estoque = new Estoque();
        Console console1 = new Console("Console1", new Especificacao("Marca1", "Modelo1", 500, "Cor1", 1));
        Console console2 = new Console("Console2", new Especificacao("Marca2", "Modelo2", 1000, "Cor2", 2));
        estoque.estoqueConsoles.add(console1);
        estoque.estoqueConsoles.add(console2);
        estoque.removerPorId(1);
        assertEquals(1, estoque.estoqueConsoles.size());
    }
}
