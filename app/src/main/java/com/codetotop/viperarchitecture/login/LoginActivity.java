package com.codetotop.viperarchitecture.login;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.codetotop.viperarchitecture.R;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginContracts.View {
    @BindView(R.id.edt_user_name)
    EditText edtUserName;
    @BindView(R.id.edt_pass_word)
    EditText edtPassWord;
    @BindView(R.id.tv_forgot_pass_word)
    TextView tvForgotPassWord;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @BindString(R.string.message_error) String MessageError;

    LoginContracts.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        presenter = new LoginPresenter(this);
    }

    @OnClick(R.id.tv_forgot_pass_word) void onClickTvForgotPassWord(){
        presenter.onClickTvForgotPassWord();
    }

    @OnClick(R.id.btn_login) void onClickBtnLogin(){
        String userName = edtUserName.getText().toString();
        String passWord = edtPassWord.getText().toString();
        presenter.onClickBtnLogin(userName,passWord);
    }

    @Override
    public void showErrorMessage() {
        Snackbar.make(btnLogin,MessageError,Snackbar.LENGTH_LONG).show();
    }
}
