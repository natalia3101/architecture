public class LoginPresenter implements iLoginContract.Presenter {
    private iLoginContract.View view;

    public LoginPresenter(iLoginContract.View view) {
        this.view = view;
    }

    @Override
    public void loginUser(String username, String password) {
        // Реализация для входа пользователя
    }

    @Override
    public void registerUser(String username, String password) {
        // Реализация для регистрации пользователя
    }

    @Override
    public void detachView() {
        view = null;
    }
}
