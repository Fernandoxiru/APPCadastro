package br.ulbra.appcadastro;


import android.view.View;
import android.widget.Button;


public class TelaPrincipal {
    private MainActivity act;
    private Button btcadastrar_usuario;
    private Button bt_listar_usuarios_cadastrados;
    private TelaCadastroUsuario tela_cadastro;
    private TelaListagemUsuarios tela_listagem;

    public TelaPrincipal(MainActivity act) {
        this.act = act;
    }

    public void CarregarTela() {
        act.setContentView(R.layout.activity_main);

        btcadastrar_usuario = act.findViewById(R.id.btcadastrar_usuario);
        bt_listar_usuarios_cadastrados = act.findViewById(R.id.bt_listar_usuarios_cadastrados);

        btcadastrar_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_cadastro.CarregarTela();
            }
        });

        bt_listar_usuarios_cadastrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_listagem.CarregarTela();
            }
        });
    }

    public void setTelaCadastro(TelaCadastroUsuario tela_cadastro) {
        this.tela_cadastro = tela_cadastro;
    }

    public void setTelaListagem(TelaListagemUsuarios tela_listagem) {
        this.tela_listagem = tela_listagem;
    }
}
