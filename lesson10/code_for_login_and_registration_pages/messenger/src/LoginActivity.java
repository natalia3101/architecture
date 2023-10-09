public class LoginActivity extends AppCompatActivity implements iLoginContract.View {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private Button registerButton;
    private ProgressDialog progressDialog;
    private iLoginContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        registerButton = findViewById(R.id.registerButton);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Подождите...");

        presenter = new LoginPresenter(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                presenter.loginUser(username, password);
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                presenter.registerUser(username, password);
            }
        });
    }

    @Override
    public void showProgress() {
        progressDialog.show();
    }

    @Override
    public void hideProgress() {
        progressDialog.dismiss();
    }

    @Override
    public void showLoginSuccess() {
        // Реализация для успешного входа
    }

    @Override
    public void showLoginError(String error) {
        // Реализация для ошибки входа
    }

    @Override
    public void showRegistrationSuccess() {
        // Реализация для успешной регистрации
    }

    @Override
    public void showRegistrationError(String error) {
        // Реализация для ошибки регистрации
    }
}

